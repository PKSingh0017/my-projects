from flask import *
import random
"""
letter used=-1, wrong letter =-2, wrong movie=-5
"""

movies = ['intersteller', 'the matrix', 'avengers', 'the fast and the furious','the lord of the rings', 'star wars', 'shutter island','the incredibles', 'mad max fury road', 'justice league']

A = 10
B = 10
C = 10
R = 1
ae = False
be = False
ce = False
display = True
def create_question(movie):
    n=len(movie)
    letters=list(movie)
    temp=[]
    for i in range(n):
        if letters[i]==' ':
            temp.append(' ')
        else:
            temp.append('*')
    qn="".join(str(x) for x in temp)
    return qn
def is_present(letter,movie):
    c=movie.count(letter)
    if c==0:
        return False
    else:
        return True
def unlock(qn,movie,letter):
    ref=list(movie)
    qn_list=list(qn)
    n=len(movie)
    temp=[];
    for i in range(n):
        if ref[i]==letter:
            temp.append(letter)
        else:
            temp.append(qn_list[i])
    qn_new="".join(str(x) for x in temp)
    return qn_new
qn = random.choice(movies)
movies.remove(qn)
nqn = create_question(qn)
refer = "lets play"
app = Flask(__name__)

@app.route('/')
@app.route('/',methods=['POST'])
def getValueA():
    global nqn, qn, refer, A, B, C, n2, ae, be, ce, R, display

    if request.method=='POST':
        refer = 'lets play'
        n2=request.form['name']                    #entered letter is being stored in n2

        if n2==qn:
            display = qn
            refer = "good job"
            nqn = qn
        elif len(n2) == 1:
            if is_present(n2, qn):
                nqn = unlock(nqn, qn, n2)
                A -= 1
            else:
                refer = 'incorrect'
                A -= 2
        elif len(n2)>1:
            refer = "incorrect movie"
            A -= 5
        if A<=0:
            A = "ELEMINATED"
            ae = True
            if be:
                result = "******Group C Wins******"
                return render_template('index.html',res = result)
            elif ce:
                result = "******Group B Wins******"
                return render_template('index.html',res = result)
        return render_template('index.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -A")

    else:
        qn = random.choice(movies)
        movies.remove(qn)
        nqn = create_question(qn)

        if not be:
            return render_template('b.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -B")
        else:
            return render_template('C.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -C")

@app.route('/b.html')
@app.route('/b.html',methods=['POST'])
def getValueB():
    global nqn, qn, refer, A, B, C, n2, ae, be, ce, R, display

    if request.method=='POST':
        refer = 'lets play'
        n2=request.form['name']                    #entered letter is being stored in n2

        if n2==qn:
            display = qn
            refer = "good job"
            nqn = qn
        elif len(n2) == 1:
            if is_present(n2, qn):
                nqn = unlock(nqn, qn, n2)
                B -= 1
            else:
                refer = 'incorrect'
                B -= 2
        elif len(n2)>1:
            refer = "incorrect movie"
            B -= 5
        if B<=0:
            B = "ELEMINATED"
            ce = True
            if ce:
                result = "******Group A Wins******"
                return render_template('index.html',res = result)
            elif ae:
                result = "******Group C Wins******"
                return render_template('index.html',res = result)
        return render_template('c.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -C")

    else:
        qn = random.choice(movies)
        movies.remove(qn)
        nqn = create_question(qn)

        if not ce:
            return render_template('c.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -C")
        else:
            return render_template('index.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -A")

@app.route('/c.html')
@app.route('/c.html',methods=['POST'])
def getValueC():
    global nqn, qn, refer, A, B, C, n2, ae, be, ce, R, display

    if request.method=='POST':
        refer = 'lets play'
        n2=request.form['name']                    #entered letter is being stored in n2

        if n2==qn:
            display = qn
            refer = "good job"
            nqn = qn
        elif len(n2) == 1:
            if is_present(n2, qn):
                nqn = unlock(nqn, qn, n2)
                C -= 1
            else:
                refer = 'incorrect'
                C -= 2
        elif len(n2)>1:
            refer = "incorrect movie"
            C -= 5
        if C<=0:
            C = "ELEMINATED"
            ce = True
            if ae:
                result = "******Group B Wins******"
                return render_template('index.html',res = result)
            elif be:
                result = "******Group A Wins******"
                return render_template('index.html',res = result)
        return render_template('c.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -C")

    else:
        qn = random.choice(movies)
        movies.remove(qn)
        nqn = create_question(qn)

        if not ae:
            return render_template('index.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -A")
        else:
            return render_template('b.html',p=nqn, q = refer, rA = A, rB = B, rC = C, title = "GROUP -B")

if __name__=='__main__':
	app.run(host = 'localhost', port = 8080)

# qn = random.choice(movies)
#         movies.remove(qn)
#         nqn = create_question(qn)
